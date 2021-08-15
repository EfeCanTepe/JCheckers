package person;

import piece.Alliance;

public abstract class Person {

    protected String name;
    protected Alliance alliance;

    protected Person(String name, Alliance alliance){
        this.name = name;
        this.alliance = alliance;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Alliance getAlliance(){
        return alliance;
    }

}
