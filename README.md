# ipl-dashboard


To fetch from git prerequisit : (Dependecies)

1) install NODE JS then install using create-react like command (NOTE : check command on net)
2) install npm using npm install command (it is create node_modules, execute command indside where react js project ex. src/frontend)
3) in visual studio install plugin java Extension pack and spring boot Extension pack
4) use compitable jdk.....and change jdk version in pom.xml as well
5) adding for style command : npm add node-sass -D  (using scss file instead of css)
6) for pie chart command : npm install react-minimal-pie-chart

---------------------------------------------------------------------------------------------------------------------------

# how to Run ::

1) backend -- Run from IplDashboardApplication.java or from spring boot Dashboard
2) frontend -- go to src/frontend in terminal and run npm start
3) install react-router : npm add react-router-dom

-----------------------------------------------------------------------------------------------------------------------------------
# How to check db ::

1) when backend started successfully then go to browser http://localhost:8080/h2-console use login saved and setting name both generic H2 (Embedded) 
by default, Driver class org.H2.Driver and give JDBC URL all things can get from application.properties (ctrl+shift+P to search file)

2) frontend on http://localhost:3000/
--------------------------------------------------------------------------------------------------------------------------------------
# Git commands :

use git terminal in VS code bash or C:\Program Files\Git\bin

for username : git config --global user.name "Enter git username here"
for email : git config --global user.email "Enter git Email here"

use command git push to commit local changes.......first give Message in source control in left panel then in git bash use command "git push"
--------------------------------------------------------------------------------------------------------------------------------------------------
# Create reactjs build
use command : npm run build

# Create springBoot build
go to respective folder and run command : ./mvnw build or ./mvnw install

# How to load reactjs on http://localhost:8080/?
 NOTE : whatever we give inside src/main/resources/ it will be a public.
		check with example : create public folder inside src/main/resources/ and create file index.html and run app again and check in browser.
 then go to package.json file and add in Debug section and change
  from :  "build": "react-scripts build" 
  to : "build": "react-scripts build && xcopy .\\build\\* ..\\main\\resources\\public\\ /s /y"
  then go to frontend directory and run : npm run build and also run springBoot and then hit url http://localhost:8080/
  
 # Change Backend URL 
	go to .env  file and REACT_APP_API_ROOT_URL=http://localhost:8080 can add backend springboot code url for production
	
# use HashRouter 
	 because in url when refresh http://localhost:8080/teams/Gujarat%20Lions it shows error because it is goes to springboot but springboot not mapped with 
	 /teams/Gujarat%20Lions so we use HashRouter so after # in url will go to ReactJs ex. http://localhost:8080/#/teams/Gujarat%20Lions here 
	 /teams/Gujarat%20Lions will go reactjs and according to map this page will show. in HashRouter link not directly to communicate with springBoot.
