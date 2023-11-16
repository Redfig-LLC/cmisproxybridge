## Pre-requisites

- SAP BTP Neo SDK/CLI
- SAP Java virtual machine
- Maven (Java builder similar to npm for Node)

- neo install local
- mvn clean install
- neo deploy-local --source <path to the sample-web-app folder>/sample-web-app/target/sample-web-app.war​
- neo start-local
- neo stop-local

When uploading the `.war` file  to SAP Neo, add the following as the "JVM Arguments":

`-Dredfig.repokey="<your repo key>" -Dredfig.reponame="<your repo name>"`

Note that Repo Name is visible from the Neo cockpit, the Repo Key is always a secret. If you do not know your repo's key, the only available route is to reset the repo key from the Neo CLI tool. Keep in mind this will require you to update the property on any existing proxy bridges.

If you do not have the source code to the existing applications and are unsure if they have the key hard-coded in, you are SOL. Best I have found is to recreate the java app from scratch (hence this repository) and upload the app/replace the destination (don't forget authorization of the Basic user)
