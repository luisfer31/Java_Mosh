public class Main {
    public static void main(String[] args) {
        var list = new GenericList<String>();
        var iterator = list.iterator();
        list.add("a");
        list.add("b");

        for (var item:list){
            System.out.println(item);
        }


        while (iterator.hasNext()){
            var current = iterator.next();
            System.out.println(current);
        }

    }
}
