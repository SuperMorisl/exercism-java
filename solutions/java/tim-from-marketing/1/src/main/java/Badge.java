class Badge {
    Integer id;
    String name; 
    String department;
    public String print(Integer id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
        StringBuilder fin = new StringBuilder();
        if (id!= null){
        fin.append("["+id+"]");
        fin.append(" - ");}
        fin.append(name);
        fin.append(" - ");
        if (department!=null){
        fin.append(department.toUpperCase());}
        else{
            fin.append("OWNER");
        }
        return fin.toString();
            
    }
}
