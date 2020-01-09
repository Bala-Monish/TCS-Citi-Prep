class findDuplicateFile {
    public List<List<String>> findDuplicate(String[] paths) {
        HashMap<String,List<String>> hashmap = new HashMap<String,List<String>>();
        for(String path : paths){
            String[] fields = path.split(" ");
            for(int i = 1;i< fields.length;i++){   
                    String[] title = fields[i].split("\\(");
                    title[1] = title[1].replace(")","");
                    List<String> list = hashmap.getOrDefault(title[1], new ArrayList<String>());
                    list.add(fields[0] + "/" + title[0]);
                hashmap.put(title[1], list);
            }
        }
        List<List<String>> result = new ArrayList<List<String>>();
        for(String k : hashmap.keySet()){
            if(hashmap.get(k).size()>1)
                result.add(hashmap.get(k));
        }
        return result;
    }
}