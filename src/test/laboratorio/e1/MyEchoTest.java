package laboratorio.e1;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import java.io.*;
import org.junit.rules.Timeout;


import org.junit.rules.TestWatcher;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyEchoTest {
    @Rule
    public Timeout globalTimeout = new Timeout(80000);

    public void ioTest(boolean fast, String comentario, String esperado, String[] args) {
        System.out.println("\n" + comentario + "\nEsperado:");
        System.out.print(esperado);
        System.out.print("----");
        System.out.println("\nEncontrado:");
        MyEcho.main(args);

        System.out.println("\n----");
    }

    static public class TestState{
        BufferedWriter grade;
        TestState() {
            try{
                grade = new BufferedWriter(new FileWriter("results/res.e1", false));
                //grade.write("@@@CLAUSES (TestBasic min 0 this 0) (TestFunc min -4.0 this -4.0)  (ioTests max 1 this -1)\n");
                //grade.write("@@@\tTestBasic\t3\n");
                grade.write("@@@\tMáxima nota: \t3\n");
            }catch (IOException e) {
                AssertionError ae = new AssertionError(e);
                throw ae;
            }
        }
        public void done() {
            try{
                grade.close();
            }catch (IOException e) {
                AssertionError ae = new AssertionError(e);
                throw ae;
            }
        }
        public void outGrade(String region, double g) {
            try{
                grade.write("@@@ "+"\t"+region+"\t"+g+"\n");
            }catch (IOException e) {
                AssertionError ae = new AssertionError(e);
                throw ae;
            }
        }
    }
    static TestState testSt;
    @BeforeClass
    public static void beforeTest() {
        testSt = new TestState();
    }
    @AfterClass
    public static void afterTest() {
        testSt.done();
    }


    @Rule
    public TestRule testWatcher = new TestWatcher() {

        @Override
        public Statement apply(Statement base, Description description) {
            return super.apply(base, description);
        }


        @Override
        protected void failed(Throwable e, Description description) {
            testSt.outGrade(description.getMethodName(), -1.0);
            /*switch(description.getMethodName()){
                case "TestEcho_1":
                case "TestEcho_2":
                    testSt.outGrade("TestFunc", -1.0);
                    break;
                case "TestEcho_0":
                    System.out.print("MyEcho no sale con error?");
                    testSt.outGrade("TestFunc", -1.0);
                default:
                    break;
            }*/
        }
    };
    @Test

    public void TestEcho_1() {
        String comentario = "Un argumento: MyEcho hola";

        String esperado = "hola\n";
        String[] args = {"hola"};

        ioTest(false, comentario, esperado, args);
        //testSt.outGrade("TestEcho_1", 1.0);


    }


    @Test
    public void TestEcho_2() {
        String comentario = "Dos argumentos: MyEcho hola adios";

        String esperado = "hola\tadios\n";
        String[] args = {"hola", "adios"};

        ioTest(false, comentario, esperado, args);
        //testSt.outGrade("TestEcho_2", 1.0);

    }


    @Test
    public void TestEcho_0() {
        String comentario = "Cero argumentos: MyEcho";


        String[] args = {};
        String esperado = "usage: Myecho args...\n";
        ioTest(false, comentario, esperado, args);

        //testSt.outGrade("TestEcho_3", 1.0);


    }
}