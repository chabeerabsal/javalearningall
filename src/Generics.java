class Generics <K,v>{
    K key;
    v value;
    Generics(K key, v value){
        this.key = key;
        this.value = value;
    }
    public K getKey(){
        return key;
    }
    public v getValue(){
        return value;
    }

    @Override
    public String toString() {
        return "THis is genrics";
    }
}
