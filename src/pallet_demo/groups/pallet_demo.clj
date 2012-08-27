(ns pallet-demo.groups.pallet-demo
    "Node defintions for pallet-demo"
    (:use
     [pallet.core :only [group-spec server-spec node-spec]]
     [pallet.crate.automated-admin-user :only [automated-admin-user]]
     [pallet.phase :only [phase-fn]]))

(def default-node-spec
  (node-spec
   :image {:os-family :ubuntu}
   :hardware {:min-cores 1}))

(def
  ^{:doc "Defines the type of node pallet-demo will run on"}
  base-server
  (server-spec
   :phases
   {:bootstrap (phase-fn (automated-admin-user))}))

(def
  ^{:doc "Define a server spec for pallet-demo"}
  pallet-demo-server
  (server-spec
   :phases
   {:configure (phase-fn
                 ;; Add your crate class here
                 )}))

(def
  ^{:doc "Defines a group spec that can be passed to converge or lift."}
  pallet-demo
  (group-spec
   "pallet-demo"
   :extends [base-server pallet-demo-server]
   :node-spec default-node-spec))
