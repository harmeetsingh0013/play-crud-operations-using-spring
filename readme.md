1. Unmanaged Dependencies: 
	In SBT, when we need to add unmanaged dependencies, create  lib folder on the root of the project and add all unmanaged dependencies. 

2. Play Eclipse Debug Config: 
	a. Go to project Debug-Configurations.
	b. select Remote-Java-Configuration.
	c. Create new configuration add Name and Select "Connect" tab 
		I. Select project
		II. Connection Type: Standard (Socket Attach)
		III. Connection Properties: HOST(localhost), PORT(9999)
	d. Click on Apply

3. Run command "play debug run"

4. Run debug configurations and add the breakpoints and hit the url. 

