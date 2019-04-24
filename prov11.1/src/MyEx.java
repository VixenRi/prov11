public class MyEx extends Exception {
    public static class ExTesrDrive {
        public static void main(String[] args) {
            String test = "yes";// вводим значение
            try {// открываем проверку
                System.out.print("t");
                doRisky(test); //обращаемся в метод doRisky взяв переменную test
                System.out.print("o");
            } catch (MyEx e) {
                System.out.print("a");// если ошибка не выкидывается, обращается сюда
            }
       finally {// выводится полюбому
            System.out.print("w");
        }
            System.out.print("s");
        }
        static void doRisky(String t) throws MyEx {// по скольку метод опасный, пытаемся выкинуть исключение
            System.out.print("h");
            if ("yes".equals(t)) {// проверяем сходится ли результаты, если да возврощается
                throw new MyEx();//ошибка выкидывается и выводится в добавок r
            }
            System.out.print("r");
        }

    }
}