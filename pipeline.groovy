pipeline {
   agent any
   stages {
       stage ("Pull") {
           steps {
              git 'https://github.com/Bhushan1196-mahajan/dome-b43.git'
           }
       }
        
       stage ("Build") {							
           steps {
            echo 'build success'
           }
       }
       
       stage ("Test") {
           steps {
            echo 'test success'
           }
       } 
       
       stage ("Deploy") {
           steps {
            echo 'Deploy success'
           }
       } 
    }
}




