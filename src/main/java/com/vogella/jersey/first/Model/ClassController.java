package com.vogella.jersey.first.Model;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassController {
    private ArrayList<Database> databases= new ArrayList();
    public ClassController(){}

    public void loadDatabase(String name, HashMap<String,ArrayList<String>> database){
        Database d = new Database(name);
        for ( String key : database.keySet() ) {
            d.addtable(key);
            database.get(key).forEach(e->{
                d.getTable(key).addColumn(e);
            });
        }
        databases.add(d);
    }

    public boolean makeBusinessRangeRule(int value1,int value2,  String table1, String Column1,String databaseName ){
       boolean b =false;
        for(Database d : databases){
            if(d.getName().equals(databaseName)){
                Table table=d.getTable(table1);
                Column column =table.getColumn(Column1);
                Business_Rule br = new Business_Rule(value1, value2,table, column);
                d.addBusinessRules(br);
                b=true;
            }
        }
        return b;
    }

}
