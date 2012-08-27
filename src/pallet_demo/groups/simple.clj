;; These commands can be executed in the REPL in order to instantiate some nodes

(require 'pallet.core 'pallet.compute 'pallet.configure)

;; Fire up the nodes (this takes a while and doesn't put much output out - you can monitor it in the EC2 monitor)
;; There are also log files in ./logs
(pallet.core/converge
 (pallet.core/group-spec "pallet-demo"
                         :count 1
                         :node-spec (pallet.core/node-spec :image {:os-family :ubuntu}))
 :compute (pallet.configure/compute-service :aws))

;; And this terminates everything
(pallet.core/converge
  (pallet.core/group-spec "pallet-demo" :count 0)
  :compute (pallet.configure/compute-service :aws))