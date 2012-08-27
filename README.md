This is a simple pallet demo

Instructions from http://palletops.com/doc/first-steps/

To get it to work, you need to do this:

    lein plugin install lein-newnew 0.3.4

    lein plugin install pallet/lein-template 0.2.5

Then you can create a new pallet project:

    lein new pallet <whatever-you-want-yer-project-called>

And then you can set-up pallet

    lein deps

    lein pallet add-service aws aws-ec2 "your-aws-key" "your-aws-secret-key"

Your aws key and secret key can be found in the aws console under "Security Credentials"

https://portal.aws.amazon.com/gp/aws/securityCredentials

I found that the first one of these I had didn't work, so I generated a new one and then it seemed to be fine.
