package ccdmy_tech_interview;

public class hashMap {
    
    //Variables
    public String[] hashMap;
    
    //Constructors

    public hashMap(int size)    {
        this.hashMap = new String[size];
    }

    //setters + getters

    public void assign(String key, String value) {
        int arrayIndex = this.hash(key);
        this.hashMap[arrayIndex] = value;
    }

    public String retrieve(String key)  {
        int arrayIndex = this.hash(key);
        return this.hashMap[arrayIndex];
    }

    //functions

    public int hash(String key) {
        int hashCode = 0;
        for (int i = 0; i<key.length();i++){
            hashCode+=key.codePointAt(i);
        }
        hashCode = hashCode % this.hashMap.length;
        return hashCode;
    }
}
