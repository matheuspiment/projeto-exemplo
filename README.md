# Projeto Java Maven-based analisado no SonarCloud usando Travis

[![Build status](https://travis-ci.org/matheuspiment/projeto-exemplo.svg?branch=master)](https://travis-ci.org/matheuspiment/projeto-exemplo)
[![Quality Gate](https://sonarcloud.io/api/badges/gate?key=com.github.matheuspiment:projeto-exemplo)](https://sonarcloud.io/dashboard/index/com.github.matheuspiment:projeto-exemplo)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/5025d66bade34f5ab686d7c3521f35f2)](https://www.codacy.com/app/matheuspiment/projeto-exemplo?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=matheuspiment/projeto-exemplo&amp;utm_campaign=Badge_Grade)
[![Code Climate](https://codeclimate.com/github/matheuspiment/projeto-exemplo/badges/gpa.svg)](https://codeclimate.com/github/matheuspiment/projeto-exemplo)

#### Este projeto é analisado em [SonarCloud](https://sonarcloud.io)!

É muito fácil executar uma análise em um projeto baseado em Maven e enviá-lo para o SonarCloud.  
Você simplesmente tem que fazer 2 coisas no seu arquivo `.travis.yml`:
* Ative o [Travis Add-on](https://docs.travis-ci.com/user/sonarqube/)
* Execute `mvn sonar:sonar` em algum ponto do tempo na seção `script`

Você pode dar uma olhada no arquivo [.travis.yml](https://github.com/matheuspiment/sonar-test/blob/master/.travis.yml)
deste projeto para ver na prática.

[![CodeScenne](https://codescene.io/projects/1360/status.svg)](https://codescene.io/projects/1360/jobs/latest-successful/results)

Projeto baseado em:
* [Java Maven-based project analyzed on SonarCloud using Travis](https://github.com/SonarSource/sq-com_example_java-maven-travis) por [SonarSource](https://github.com/SonarSource).
* [Exemplo](https://github.com/kyriosdata/exemplo) por [kyriosdata](https://github.com/kyriosdata)
