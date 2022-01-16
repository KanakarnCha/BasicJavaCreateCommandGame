package field;

import java.sql.Array;

public class Map {
    String nameMap[] = {"CandyMap","WestMap","longMap","ThaiMap"};
    String name;
    public Map(){
    }
    public Map(int randomMap){
        this.name = nameMap[randomMap];
    }

    public String getName() {
        return name;
    }
}
