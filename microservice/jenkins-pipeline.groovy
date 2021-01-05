#!groovy

pipeline {
	agent any
	
	environment {
		REPOSITORY='http://gitlab.qinchao.me:9080/sulvto/microservice.git'
		MODULE='user-edge-service'
		PROJECT_PATH='microservice'
	}

	stages {
		stage('获取代码') {
			steps {
				echo 'start fetch code from git'
				deleteDir()
                git branch: 'microservice', url: 'http://gitlab.qinchao.me:9080/sulvto/microservice.git'
			}
		}

		stage('代码静态检查') {
			steps {
        		echo 'start code check'
        	}
        }                                       

		stage('编译+单元测试') {
			steps {
				echo 'start compile'
				dir(PROJECT_PATH) {
					echo pwd()
					sh 'mvn -U -pl ${MODULE} -am clean package'
				}
			}
		}                                       
		
		stage('构建镜像') {
            steps {
                echo 'start build image'
                dir(PROJECT_PATH) {
                    sh './build-images.sh ${MODULE}'
                }
            }
        }

        stage('发布系统') {
            steps {
                echo 'start deploy'
                dir(PROJECT_PATH) {
                    sh './deploy.sh ${MODULE}'
                }
            }
        }
    }
}
