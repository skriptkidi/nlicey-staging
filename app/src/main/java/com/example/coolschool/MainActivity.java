package com.example.coolschool;



        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.TextView;

        import com.google.gson.Gson;
        import com.google.gson.GsonBuilder;
        import com.google.gson.JsonObject;
        import com.google.gson.JsonParser;
        import com.google.gson.reflect.TypeToken;

        import org.json.JSONObject;

        import java.util.HashMap;
        import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = (TextView) findViewById(R.id.textView);

        String json = "{\n" +
                "  \"meta\": \"lessons list\",\n" +
                "  \"lessons\": {\n" +
                "    \"monday\": {\n" +
                "      \"one\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 1,\n" +
                "          \"name\": \"Художня культура\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"two\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 2,\n" +
                "          \"name\": \"Фізична культура\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"three\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 3,\n" +
                "          \"name\": \"Біологія\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"four\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 3,\n" +
                "          \"name\": \"Біологія\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"five\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 4,\n" +
                "          \"name\": \"Англійська мова\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"six\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 4,\n" +
                "          \"name\": \"Англійська мова\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"seven\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 5,\n" +
                "          \"name\": \"Екологія\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    \"tuesday\": {\n" +
                "      \"one\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 6,\n" +
                "          \"name\": \"Алгебра\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"two\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 7,\n" +
                "          \"name\": \"Інформаційні технології\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"three\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 8,\n" +
                "          \"name\": \"Хімія\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"four\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 9,\n" +
                "          \"name\": \"Українська мова\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"five\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 10,\n" +
                "          \"name\": \"Фізика\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"six\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 11,\n" +
                "          \"name\": \"Українська література\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"seven\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 12,\n" +
                "          \"name\": \"Хімія (спецкурс)\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    \"wednesday\": {\n" +
                "      \"one\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 8,\n" +
                "          \"name\": \"Хімія\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"two\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 12,\n" +
                "          \"name\": \"Хімія (спецкурс)\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"three\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 7,\n" +
                "          \"name\": \"Інформаційні технології\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"four\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 14,\n" +
                "          \"name\": \"Світова література\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"five\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 2,\n" +
                "          \"name\": \"Фізична культура\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"six\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 15,\n" +
                "          \"name\": \"Історія України\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    \"thursday\": {\n" +
                "      \"one\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 8,\n" +
                "          \"name\": \"Хімія\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"two\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 15,\n" +
                "          \"name\": \"Історія України\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"three\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 9,\n" +
                "          \"name\": \"Українська мова\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"four\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 8,\n" +
                "          \"name\": \"Хімія\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"five\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 17,\n" +
                "          \"name\": \"Геометрія\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"six\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 17,\n" +
                "          \"name\": \"Геометрія\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    \"friday\": {\n" +
                "      \"one\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 6,\n" +
                "          \"name\": \"Алгебра\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"two\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 6,\n" +
                "          \"name\": \"Алгебра\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"three\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 3,\n" +
                "          \"name\": \"Біологія\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"four\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 11,\n" +
                "          \"name\": \"Українська література\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"five\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 15,\n" +
                "          \"name\": \"Історія України\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"six\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 18,\n" +
                "          \"name\": \"Економіка\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"seven\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 3,\n" +
                "          \"name\": \"Біологія\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    \"saturday\": {\n" +
                "      \"one\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 8,\n" +
                "          \"name\": \"Хімія\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"two\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 10,\n" +
                "          \"name\": \"Фізика\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"three\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 3,\n" +
                "          \"name\": \"Біологія\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"four\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 4,\n" +
                "          \"name\": \"Англійська мова\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"five\": {\n" +
                "        \"subject\": {\n" +
                "          \"id\": 19,\n" +
                "          \"name\": \"Астрономія\"\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "  }\n" +
                "}";

        String[] day = new String[6];
        day[0]="monday";
        day[1]="tuesday";
        day[2]="wednesday";
        day[3]="thursday";
        day[4]="friday";
        day[5]="saturday";

        String[] lessonnumber = new String[8];
        lessonnumber[0]="one";
        lessonnumber[1]="two";
        lessonnumber[2]="three";
        lessonnumber[3]="four";
        lessonnumber[4]="five";
        lessonnumber[5]="six";
        lessonnumber[6]="seven";
        lessonnumber[7]="eight";

        JsonObject[] dayvalue = new JsonObject[6];
        JsonObject[][] lessonnumbervalue = new JsonObject[6][8];
        JsonObject[][][] subjectsvalue= new JsonObject[6][8][2];

        JsonObject lessonsobj = (new JsonParser()).parse(json).getAsJsonObject();
        JsonObject subjectobj = (new JsonParser()).parse(json).getAsJsonObject();
        lessonsobj.get("lessons").toString();

        for (int x = 0; x < 6; x++){
            dayvalue[x]=lessonsobj.getAsJsonObject(day[x]);

            for (int y = 0; y < 8; y++){
                lessonnumbervalue[x][y]=lessonsobj.getAsJsonObject(lessonnumber[y]);

                for (int z = 0; z < 2; z++){
                    subjectsvalue[x][y][z]=subjectobj.getAsJsonObject("subject");
                    subjectsvalue[x][y][z].get("name");
                }
            }
        }


      // String a=subjectsvalue[1][1][1].getAsString("name");
       //  text.setText(a);
       // text.setText(dayvalue[1].toString());

        //users = jsonObject.getJSONArray(JSON_ARRAY);

    }


}





