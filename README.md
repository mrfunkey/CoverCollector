<div align="center">
	<code><img width="50" src="https://raw.githubusercontent.com/marwin1991/profile-technology-icons/refs/heads/main/icons/html.png" alt="HTML" title="HTML"/></code>
	<code><img width="50" src="https://raw.githubusercontent.com/marwin1991/profile-technology-icons/refs/heads/main/icons/css.png" alt="CSS" title="CSS"/></code>
	<code><img width="50" src="https://raw.githubusercontent.com/marwin1991/profile-technology-icons/refs/heads/main/icons/java.png" alt="Java" title="Java"/></code>
	<code><img width="50" src="https://raw.githubusercontent.com/marwin1991/profile-technology-icons/refs/heads/main/icons/spring_boot.png" alt="Spring Boot" title="Spring Boot"/></code>
	<code><img width="50" src="https://raw.githubusercontent.com/marwin1991/profile-technology-icons/refs/heads/main/icons/aws.png" alt="AWS" title="AWS"/></code>
</div>
# CoverCollector
A high-performance, minimalist web interface for searching and collecting uncompressed, high-quality physical album artwork variants.

## Live Demo
The project is available via the [Live Demo](http://covercollector-env.eba-ffenptyp.us-east-2.elasticbeanstalk.com/) hosted with AWS.

## Features
* **Real-Time Reloads:** Results are fetched and displayed without refreshing the tab.

* **Image Scaling**: Converts standard thumbnail links into LQ (500x500) and HQ (3000x3000) dimensions through the iTunes API.

* **Simple Layout**: Separate searchbars for artists and albums, fixed boxes for images of varying sizes, and a dark theme to reduce eye strain.

* **Lightweight Architecture**: No heavy frameworks, external libraries or complex databases to install/configure.

## Local Setup
### Prerequisites
* **Java Development Kit (JDK):** Version 21 installed.
* **Maven:** Installed globally or via IDE.

### Step 1: Clone Repository
Open your terminal and clone the codebase into your local workspace directory:
```
bash
git clone [https://github.com/YOUR_USERNAME/CoverCollector-API.git](https://github.com/YOUR_USERNAME/CoverCollector-API.git)
cd CoverCollector-API
```
### Step 2: Configure local port
Open src/main/resources/application.properties and ensure the port is set to 8080 for local testing:
```
server.port=8080
```
### Step 3: Build and run
Run the following commands in your terminal to compile and start the server:
```
mvn clean package
java -jar target/covercollector-0.0.1-SNAPSHOT.jar
```
### Step 4: Open the application
Navigate to the interface in your web browser:
```
https://localhost:8080
```
