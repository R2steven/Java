package ccdmy_tech_interview;

public class hashMap {
    
    //Variables
    public LinkedListHashMap[] hashMap;
    
    //Constructors

    public hashMap(int size)    {
        this.hashMap = new LinkedListHashMap[size];
        for (int i=0; i<hashMap.length;i++){
            this.hashMap[i] = new LinkedListHashMap();
        }
    }

    //setters + getters

    public void assign(String key, String value) {
        int arrayIndex = this.hash(key);
        this.hashMap[arrayIndex].addKeyValue(key, value);
    }

    public String retrieve(String key)  {
        int arrayIndex = this.hash(key);
        return this.hashMap[arrayIndex].findKey(key).data;
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
