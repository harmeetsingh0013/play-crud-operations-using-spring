# Importan Points

There are some basic and important points for setup playframwork projects as below: 

1. Unmanaged Dependencies: In SBT, when we need to add unmanaged dependencies, create  lib folder on the root of the project and add all unmanaged dependencies. 
2. Play Eclipse Debug Config:   
  - Go to project Debug-Configurations.
  - select Remote-Java-Configuration.
  -  Create new configuration add Name and Select "Connect" tab 
        - Select project
        - Connection Type: Standard (Socket Attach)
        - Connection Properties: HOST(localhost), PORT(9999)
  -Click on Apply
3. Run command "play debug run"
4. Run debug configurations and add the breakpoints and hit the url.