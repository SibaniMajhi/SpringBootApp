pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'Maven 3.6.3') {
                    sh 'mvn clean compile'
                }
            }
        }
        
        stage('Checkout') {
            git url: 'https://github.com/SibaniMajhi/SpringBootApp.git', CredentialsID: 'SibaniMajhi', branch: 'main'
        }

        stage('Build') {
            sh 'mvn clean install'

            def pom = readMavenPom file:'pom.xml'
            print pom.version
            env.version = pom.version
        }

        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'Maven 3.6.3') {
                    sh 'mvn test'
                }
            }
        }


        stage ('Deployment Stage') {
            steps {
                withMaven(maven : 'Maven 3.6.3') {
                    sh 'mvn deploy'
                }
            }
        }
    }
}
