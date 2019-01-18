#!groovy

pipeline {
	agent any
	
	environment {
		REPOSITORY='ssh://git@gitlab.qinchao.me:2222/sulvto/microservice.git'
		MODULE='user-edge-service'	
		PROJECT_PATH='Java/microservice'
	}

	stages {
		stage('获取代码') {
			steps {
				echo 'start fetch code from git'
				deleteDir()
                git branch: 'Java', url: '${REPOSITORY}'
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
					sh 'mvn -U -pl ${MODULE} -am clean package'
				}
			}
		}                                       
		
		stage('构建镜像') {
        	steps {
        		echo 'start build image'
				dir(PROJECT_PATH) {
					sh 'build-images.sh ${MODULE}'
				}
        	}
        }                                       
	}
}
