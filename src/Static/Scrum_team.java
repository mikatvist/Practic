package Static;

import today.B;

import java.util.ArrayList;
import java.util.Arrays;

public class Scrum_team {
    ArrayList<Tester> testers = new ArrayList<>();
    ArrayList<Developer> developers = new ArrayList<>();
    String PO;
    String BA;
    String SM;
public void setInfo (String PO, String BA, String SM){
    this.PO=PO;
    this.BA=BA;
    this.SM=SM;
}
public void addTester (Tester tester){
    testers.add(tester);
}
public void addTesters (Tester[] testers){
if (testers.length==0){
    return;
}
this.testers.addAll(Arrays.asList(testers));
}
public void removeTester(long employeeID){
    testers.removeIf(p-> p.employeeID==employeeID);

}
public void addDeveloper (Developer developer){
    developers.add(developer);
}
public void addDevelopers (Developer[] developers){
    if (developers.length==0){
        return;
    }
    this.developers.addAll(Arrays.asList(developers));
}
public void removeDeveloper(long employeeID){
    developers.removeIf(p->p.employeeID==employeeID);

}
public String toString (){
return testers.size()+" Testers,"+ developers.size()+" developers, PO: "+PO+" BA: "+ BA+" SM: " + SM;
}
}

