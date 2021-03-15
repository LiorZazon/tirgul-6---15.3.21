package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //targil 1:

        // we will use @override, we change the behavior of that function to what we need.
        //we will do that for a few reasons: 1. other people we know that this function is already exist at the father,
        // 2. easy to understand and read, 3. to find errors - if we wrote the function wrong override will show us the error.

        //targil 2:

        //Fruit class and Orange class was made.

        //targil 3:

        // Apartment class and studioApartment class was made.

        //targil 4:

        // etgar

        //targil 5:

        Teacher teacher1 = new MathTeacher();
        Teacher teacher2 = new HistoryTeacher();
        //targil 6:

        //teacher1.m_math_skill;
        // i couldnt do that, because i was looking at Teacher class so i could approach only to the fields on that class.
        // i can't be sure that if i look at teacher class i will receive math teacher, cause it might be history teacher also.
        //the function with the casting is down below

        //targil 7:

        //מחלקה שלא ניתן לייצר ממנה מופע, יש לציין אנו בתור מפתחים לא יכולים לייצר ממנה מופע אך java בהחלט כן,
        //לדןגמה: כאשר מתבצעת ירושה שזו בעצם הכלה של האב בבן ה-java מייצרת בתוך הבן הכל שדות פונקציות ובהחלט מופע.

        // כן מחלקה אבסטרקטית יכולה לרשת ממחלקה אבסטרקטית אחרת, היא פשוט לא חייבת לממש פונקציות אבסטרקטיות מהמחלקה שהיא יורשת ממנה

        //targil 8:

        //פונקציה אבסטרקטית - פונקציה שאין לה גוף , ומחייבת את היורשים ליצור אותה אצלם ולממש אותה.
        //לא, פונקציה אבסטרקטית במחלקה אבסטרקית לא יכולה להיות private כיוון שייווצר חוב שחייב לממש אותה אך זה בלתי אפשרי כי אי אפשר לרשת אותה וממילא עץ הירושה נהרס.
        //לא ניתן להגדיר גוף לפונקציה אבסטרקטית רק חתימה.

        //targil 9:

        //לא כל הפונקציות במחלקה אבסטרקטית חייבות להיות אבסטרקטיות בהחלט יכולות להיות פונקציות רגילות.
        //כן, מחלקה אבסטרקטית לא חייבת שיהיו בה פונקציות אבסטרקטיות

        //targil 10:

        //mechanic class, cars mechanic, air plane mechanic class was made.

        //targil 11:

        //i cant override the method insertNewBatteries because its final.

        ElectricDevice samsungTV = new TV(5.3f, 55.2);
        ElectricDevice cellphoneNokia = new Cellphone(6.1f, "nokia");

        //targil 12:

        // אי אפשר לרשת ממחלקה שהיא final.
        //מחלקה אנו רוצים להשאיר אותה כמו שהיא ושאףאחד לא ייגע בה או ישנה אותה.
        // לפעמים נגיע למימוש כל כך טוב שלא נרצה ליצור מימוש נוסף ביורשים כיוון שזה ייצור בלבול אז נחסום אפשרות זו מלכתחילה.

        //targil 13:

        //interface - סוג מסויים של חוזה, מעין מחלקה אבסטרקטית עם פונקציות אבסטרקטיות פשוט בלי המחלקה עצמה
        //זו הדרך שלנו לייצר חובות/יכולות ופונקציות שנדע בוודאות שאותה מחלקה תממש מבלי לייצר מחלקת אב משותפת לכולן.
        //כאשר אנו רוצים ליצור פרוייקט כלשהו ואנו רוצים שבכל המחלקות באותו פרוייקט יהיה את אותה הפונקציה ואין
        //לנו מכנה משותף בין אותן מחלקות

        //targil 14:

        //לא ניתן להוסיף access modifier ל-interface כיוון ש-unterface בהגדרה שלו הוא אוטומטית אוסף של חובות
        //ולכן גם הוא public כמו כן אין צורך להוסיך את המילה abstract כי אוטומטית כל מה שאשים שם יהיה אבסטרקטי.
        //כל מחלקה שתרצה יכולה לממש את הפונקציות שקיימות ב-interface
        //כן, מחלקה יכולה לרשת יותר מinterface אחד
        //מלכתחילה interface לא אמור ולא יכול להחזיק שדות מידע או קונסטרקטור, יש מקרים מאוד ספציפים שכן תלוי איזה ממבר

        //targil 15:

        //targil 16:

        // מחלקה אבסטרקטית -  מחלקה מופשטת שנועדה להחזיק איזשהו אבא שאפשר לתת לו יורשים ובאבא נשים כל מיני תכונות או פונקציות שיועברו ליורשים האלה
        //interface- סוג מסויים של חוזה, מעין מחלקה אבסטרקית פשוט בלי המחלקה עצמה, דרך ליצור חובות / פונקציות שמחלקה
        //מסויימת תצטרך לממש מבלי לייצר מחלקת אבא משותפת לכולן

        //מתי נבחר בכל אחד מהם:

        //הרבה פעמים ההבדל ביניהם יהיה מאוד דק ונתקשה לדעת מה לבחור, כמובן שאם מדובר ביותר מחוזה אחד הבחירה שלנו תהיה שימוש ב-interface
        //כאשר נצטרך להשתמש בקונסטרקטור או בשדות מידע הבחירה שלנו מיד תהיה מחלקה אבסטרקטית במיוחד אם למחלקות אלה יש מכנה משותף.

        //targil 17:

        IPlayer player1 = new GuitarPlayer();
        IPlayer player2 = new PianoPlayer();

        //targil 18:

        //מערך רשימתי שאפשר להוסיף לו איברים או למחוק ממנו איברים/אייטמים.
        //ההבדל בינו לבין מערך רגיל הוא שכאשר יש לנו רשימה ואנו לא יודעים מראש מה גודלה או שאנו רוצים באופן
        //דינאמי להוסיף איברים או למחוק אותם אז אפשר לעשות זאת בצורה ממש פשוטה בקוד

        //targil 19:

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        System.out.println(numbers);
        System.out.println(numbers.get(0));
        numbers.remove(1);
        System.out.println(numbers.indexOf(9));


        //targil 20:

        //targil 21:

        //זה מבצע import למחלקה המתאימה ב-java וגם כך אנו יודעים שזו פונקצית בדיקה.
        //assert equals -  פקודה שמבצעת את ההשוואה של האם מה שכתוב בצד שמאל שווה למה שכתוב בימין, ברגע שהפקודה הזו רואה
        //שמה שכתוב ב-2 הצדדים לא שווה הטסט נכשל  ואם התשובה זהה הטסט עובר

        //targil 22:











    }

    //6:

    public void identifyTeacher(Teacher teacher){
        if (teacher instanceof MathTeacher)
        {
            MathTeacher teacherr = (MathTeacher)teacher;
            System.out.println(teacherr.m_math_skill);
            System.out.println("math teacher");
        }
        else if (teacher instanceof HistoryTeacher)
        {
            HistoryTeacher teacherH = (HistoryTeacher)teacher;
            System.out.println(teacherH.m_field_of_profession);
            System.out.println("history teacher");
        }
        else {
            throw new ClassCastException("unknown class");
        }
    }

    //11
    public void repairElectricDevice(ElectricDevice device1) {
        if (device1.m_worksOnBatteries == true) {
            device1.insertNewBatteries();
        }
        if (device1.isFaulty == false) {
            return;
        }
        device1.fixDevice();
        if (device1 instanceof TV) {
            TV tv = (TV) device1;
            System.out.println(((TV) device1).m_screen_size);
        } else if (device1 instanceof Cellphone) {
            Cellphone cellphone = (Cellphone) device1;
            System.out.println(((Cellphone) device1).m_brand);
        } else {
            throw new ClassCastException("unknown class");
        }
        System.out.println("fixing is done!");

    }
    //17:
    public static void startMusicShow(Player player){
        player.play();
        if (player instanceof GuitarPlayer){
            GuitarPlayer player1 = (GuitarPlayer)player;
            player1.rockAndRoll();
        }
        else if (player instanceof PianoPlayer){
            PianoPlayer player2 = (PianoPlayer)player;
            player2.playJazz();
        }
    }


    }


