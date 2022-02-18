# Integration commands

### Restore
> java -jar sl-build-scanner.jar -restorePom -workspacepath .

### Regular build
> java -jar sl-build-scanner.jar -pom -configfile config.json -workspacepath .

### PR build
> java -jar sl-build-scanner.jar -pom -configfile configPR.json -workspacepath .


# Command groups
> java -jar sl-build-scanner.jar -pom -configfile config.json -workspacepath .
> 
> ./mvnw clean package
> 
> java -jar sl-build-scanner.jar -restorePom -workspacepath .


> java -jar sl-build-scanner.jar -pom -configfile configPR.json -workspacepath .
>
> ./mvnw clean package
>
> java -jar sl-build-scanner.jar -restorePom -workspacepath .