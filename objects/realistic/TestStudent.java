package objects.realistic;

public class TestStudent {
    
    /** Liste des objets accessibles à toute cette classe test */
    static Student[] students = new Student[3];
    
    public static void main(String[] args) {
        boolean passedCon = testConstructor();
        if ( passedCon )
        {
            testToString();
            boolean passedAdd = testAddCourse();
            if ( passedAdd )
            {
                testUpdateGrade();
                testToString();
            }
        }

    }

    static boolean testConstructor()
    {
        // liste de noms prévus
        String[] names = { "Joanne", "Karim", "Chris" };
        
        // longueur de la plus courte liste pour éviter des
        // exceptions de type IndexOutOfBounds
        int shortestList = Math.min( names.length, students.length );

        // construire les objets de la liste students
        for ( int i = 0; i < shortestList; i++ )
        {
            students[i] = new Student( names[i], i + 1 );
        }

        // vérifier si cela a bien fonctionner
        int errors = 0;
        for ( int i = 0; i < shortestList; i++ )
        {
            if ( ! (students[i].name).equals( names[i] ) || students[i].id != i+1 )
            {
                errors++;
            }
        }
        if ( errors == 0 ) // tout est comme prévu
        {
            System.out.println( "Test du constructeur : RÉUSSI" );
            return true;
        }
        // sinon
        System.out.println( "Test du constructeur : ÉCHEC" );
        return false;
    }

    static void testToString()
    {
        System.out.println( "\nTestage de la méthode toString()...");
        for ( Student s : students )
        {
            System.out.println( s );
        }
    }

    static boolean testAddCourse()
    {
        String[] testCourses = { "Math", "Français", "Informatique", "Arts" };
        
        System.out.println( "\nTest d'ajout de cours...");

        // ajouter tous les cours à chaque élève
        for ( Student s : students )
        {
            for ( String c : testCourses )
            {
                s.addCourse( c );
            }
        }

        // vérifier que les cours sont bien là
        int errors = 0;
        for ( Student s : students )
        {
            for ( String c : testCourses ) if ( ! s.courses.containsKey( c ) ) errors++; 
        }
        if ( errors == 0 )
        {
            System.out.println( "Test d'ajout de cours : RÉUSSI " );
            return true;
        }
        System.out.println( "Test d'ajout de cours : ÉCHEC " );
        return false;
    }

    static void testUpdateGrade()
    {
        System.out.println( "\nTest de changement de notes...");
        for ( Student s : students )
        {
            System.out.println( s.name );
            for (String course : s.courses.keySet() )
            {
                // aléatoire entre 60 et 100
                double grade = 60.0 + Math.random()*40;
                s.updateCourseGrade( course, grade );
            }
            System.out.println();
        }
    }    
}
