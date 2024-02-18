package homeWorkOPP1.task6.entitys;

public class Users {
    UserEntity[] users;
    int currentId=1;

    public Users(int lengthUsers) {
        users=new UserEntity[lengthUsers];
    }
    public void editUser(int id, String newName){
        int index=searchUserById(id);
        if(index!=-1){
            users[index].setName(newName);
            System.out.println("The name changed successfully");
        }else{
            System.out.println("User with id - "+id+" not found");
        }
    }
    public void delUser(int id){
        int index=searchUserById(id);
        if(index!=-1){
            users[index]=null;
            System.out.println("The user with id - "+id+" deleted");
        }else{
            System.out.println("User with id - "+id+" not found");
        }
    }
    public void printAllUsers(){
        for(UserEntity user:users){
            printUser(user);
        }
    }
    private void printUser(UserEntity user){
        System.out.println();
        System.out.println("User id : "+user.getId());
        System.out.println("User Name : "+user.getName());
        System.out.println("===============================");
    }
    public void searchUser(String name){
        int index=searchUserByName(name);
        if(index==-1){
            System.out.println("User with name - "+name+" not found");
        }else{
            printUser(users[index]);
        }
    }
    public void searchUser(int id){
        int index=searchUserById(id);
        if(index==-1){
            System.out.println("User with id - "+id+" not found");
        }else{
            printUser(users[index]);
        }
    }
    private int searchUserByName(String name){
        for(int i=0;i<users.length;i++){
            if(users[i].getName()==name){
                return i;
            }
        }
        return -1;
    }
    private int searchUserById(int id){
        for(int i=0;i<users.length;i++){
            if(users[i].getId()==id){
                return i;
            }
        }
        return -1;
    }
    public void saveUser(String name){
        int index=testField();
        if(index!=-1) {
            users[index] = new UserEntity(currentId, name);
            System.out.println("New user "+name+" added with id - "+currentId);
            System.out.println();
            currentId++;
        }else {
            System.out.println("Error: 'Application has no place to save new user!'");
            System.out.println();
        }
    }
    private int testField(){
        for (int i=0; i<users.length;i++){
            if(users[i]==null){
                return i;
            }
        }
        return -1;
    }
}
