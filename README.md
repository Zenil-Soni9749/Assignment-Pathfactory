"# Assignment-Pathfactory" 
How to Clone this Framework in Eclipse?

Open Eclipse

Go to Window--> Show View--> Other

![image](https://user-images.githubusercontent.com/101087288/157053890-783dd690-2f97-45c6-a9d3-0cc7bf618923.png)

Select Clone Git repo

![image](https://user-images.githubusercontent.com/101087288/157054246-5e05e0b6-2ef1-49c8-9fff-7d284e68c83e.png)

Copy Git repo url --> https://github.com/Zenil-Soni9749/Assignment-Pathfactory.git

![image](https://user-images.githubusercontent.com/101087288/157054553-a6e25792-2b3f-4396-9d68-8c32451ac702.png)

Press Next, Select master 

![image](https://user-images.githubusercontent.com/101087288/157054815-39fed674-79bd-4bd4-a85f-18315cc8ac5a.png)


Select Next, Change path to ur local Workspace

![image](https://user-images.githubusercontent.com/101087288/157054978-767cadbd-3cae-49ad-83b5-0643bf7be2bd.png)


Select Finish

The Show View UI will be updated with project 

![image](https://user-images.githubusercontent.com/101087288/157055172-f37d9648-71bb-4ae0-9fb1-77ad2374c2ba.png)


Goto "Working directory" Right Click --> Import Projects

![image](https://user-images.githubusercontent.com/101087288/157055335-e73fb570-3482-4594-96e1-886763c32b56.png)


Select Next and Finish

![image](https://user-images.githubusercontent.com/101087288/157055663-3eb2080b-2774-422d-afbb-b2094db90b9d.png)


Go to Package Explorer, If not visible Go to Window--> Show View--> Package Explorer 

We can see project structure

![image](https://user-images.githubusercontent.com/101087288/157055994-9e3a299e-907b-46af-9073-c60260981261.png)

Right Click Project Structure--> Refresh and GotoMaven-->Update Project

How to run this Framework in Eclipse?

Right Click Folder Structure --> Run As --> Maven Clean --> Mavne Build --> Maven test

![Screenshot (36)](https://user-images.githubusercontent.com/101087288/157058994-0a499260-7ff9-450b-8fec-afd1267fe7ca.png)


If Maven Build Fails Change your Execution from JRE to JDK.

You can see the output in test-output folder --> Extent.html

![image](https://user-images.githubusercontent.com/101087288/157059564-c19bbc3c-3258-46c9-b61b-e8b04d4f3dda.png)


How to run this Framework using cmd?

Goto the cloned project Folder Structure open CMD

Use Maven commands(Make sure to install Maven)
  --mvn -version
  --mvn clean
  --mvn test

