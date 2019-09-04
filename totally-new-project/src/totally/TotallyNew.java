/**
 * @author justi
 * @version 9/4/2019
 */
/*
How to link your local Eclipse project with a GitHub repository.  
1. Go to github create new repository (make sure it is completely blank with no README).
2. Copy http URL from github
3. Go to Eclipse --> Right click on project --> Team--> Share Project--> Create new Git Repo. (Choose a local folder where you keep all your git repos locally.)
4. Go to Git Staging--> add to index --> commit and push
5. Right click on Git Repositories push to up stream
6. It will ask you for Remote. Paste your http URL of github which you copy in step 2
7. Enter username and password of github -- > Finish

You can use one local repo (connected to the same one remote repo) for multiple/many projects.
For example, create one repo for all of your assignments in a course in school.
 */
package totally;

public class TotallyNew {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Yay, this is totally new main method in TotallyNew class in totally package");
        System.out.println("in totally-new-project in totally-new-local-repo with");
        System.out.println("totally-new-stuff repo on GitHub.");
    }

}
