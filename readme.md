# Important Points for setup Play Project
Create the new play project using follwoing command: 
```sh
$ play new project_name
```
For detail information got to this link: https://www.playframework.com/documentation/2.0/NewApplication

For using eclipse IDE with play project there are some important and basic points as follow: 
> Note: For setting eclipse for Play click on this link:  https://www.playframework.com/documentation/2.2.x/IDE

* You need to create eclipse settings files for project using following command: 
```sh
$ project-dir> play eclipse
```
* When ecilipse files are created successfully, import the project as follow in eclipse: 
```sh
import > General > Existings Project Into Workspace
```

#####There are some points, we need to discuss for setup this sample application.
1. Checkout `Perform CRUD Operations using Play-Framework with Spring Depedency Injection` project using `TortoiseGit` or `Egit`.
2. In this project we are using H2 embedded database. For create database first time, go to project `conf/application.conf` file and uncomment the `evolutionplugin=disabled` line and save the file. 
3. Now run the following command: 
```sh
$ project_dir> play clean compile
$ project_dir> play run
```
4. Your database are created successfully in project directory. 
5. If you want to check you database, stop the application and run the following command:
```sh
$ project_dir> play
```
6. Your playframework is start and the run following commands as below:
```sh
[project_dir] $ 
[project_dir] $ h2-browser
```
7. Your browser is open and select `Generic Server` and enter username and password.
> Note: Please check conf/application.conf file for db cridentials and settings.
8. After create the database comment the `evolutionplugin=disabled` line from `conf/application.conf` file, because if we not comment, every time when application is start the play-framework create database new and your previous data is lost.

### Depedencies
1. Unmanaged Dependencies: In SBT, when we need to add unmanaged dependencies, create  lib folder on the root of the project and add all unmanaged dependencies.

### Debugger
1. Play Eclipse Debug Config:   
  - Go to project Debug-Configurations.
  - select Remote-Java-Configuration.
  -  Create new configuration add Name and Select "Connect" tab 
        - Select project
        - Connection Type: Standard (Socket Attach)
        - Connection Properties: HOST(localhost), PORT(9999)
  -Click on Apply
2. Run command `play debug run`.
3. Run debug configurations and add the breakpoints and hit the url.
 
>Note: When importing the project into eclipse and you got the errors in your source code and templates. Please use the following link :  http://stackoverflow.com/questions/28104968/scala-ide-4-0-0-thinks-theres-errors-in-an-out-of-the-box-play-framework-2-3-7
