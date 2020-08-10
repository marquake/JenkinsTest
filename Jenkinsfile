pipeline {
  agent any
  stages {
    stage('DES') {
      parallel {
        stage('DES') {
          steps {
            echo 'INICIO'
            slackSend()
          }
        }

        stage('error') {
          steps {
            echo 'FIN DESA'
          }
        }

      }
    }

    stage('PRE') {
      parallel {
        stage('PRE') {
          steps {
            echo 'INIIO PRE'
          }
        }

        stage('error') {
          steps {
            echo 'FIN PRE'
          }
        }

      }
    }

    stage('PRO') {
      parallel {
        stage('PRO') {
          steps {
            echo 'INICIO PRO'
          }
        }

        stage('error') {
          steps {
            echo 'FIN PRO'
          }
        }

      }
    }

    stage('FIN') {
      steps {
        echo 'FIN'
      }
    }

  }
}