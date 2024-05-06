# mavenproject

{REPLACE WITH PROJECT DESCRIPTION}

## Usage

Add this library as a dependency to your project's pom.xml.

```xml
<dependency>
  <groupId>EcommerseProject</groupId>
  <artifactId>mavenproject</artifactId>
  <version>0.0.1-SNAPSHOT</version>
</dependency>
```

{REPLACE WITH MORE DETAILS ABOUT USING THE LIBRARY}

## Developing This Project

Note: These instructions assume Docker and VS Code, with the Dev Containers extension, are installed.

Git clone the project locally and open it with VS Code. When prompted, reopen the project in a dev container. It will take a couple of minutes to download all of the dependencies and prepare the container for Java development. Proceed with development once the initialization is complete.

Tests can be run from within VS Code. Click the Testing icon and click "Run Tests".

To build and install the project locally in order to include it in another project for testing, run the following from the project directory on the host machine.

```
docker run -it -u $UID:$(id -g) -e MAVEN_CONFIG=/var/maven/.m2 -v ~/.m2:/var/maven/.m2 -v .:/project maven mvn -f /project/pom.xml -Duser.home=/var/maven clean package install
```

Building and deploying this project is handled by the GitLab pipeline. There are two possible destinations for the built project: the BYU HBLL internal Maven repository or the central Maven repository. Use the internal repository for non-public releases and the central repository for public open source releases. To instruct the pipeline to deploy to Maven Central, set the `MAVEN_CENTRAL_DEPLOY` CI/CD variable to `true`. Deploying to either the internal or central repository requires manually playing the deploy job. Note: Deployments to Maven Central are permanent.

## License

[License](LICENSE.md)