pipeline {
    agent any

    stages {
        stage('Polaris') {
            steps {
                security_scan product: 'polaris',
                    polaris_assessment_types: 'SCA',
                    polaris_application_name: "E2E-Integration-App",
                    polaris_project_name: "TestProject"
            }
        }
    }
}
