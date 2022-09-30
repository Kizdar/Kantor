package json;

import com.google.gson.*;
import model.Cash ;
import org.hibernate.annotations.common.util.impl.Log;
import user.HttpClient;

import java.util.Scanner;

public class OpenValue {
    HttpClient json = new HttpClient();
Scanner input = new Scanner(System.in);
    public double getValue() throws Exception {
        System.out.println("Podaj walute");
        String code = input.nextLine();
        String myJsonString = json.getValue(code);
        JsonObject object = new Gson().fromJson(myJsonString, JsonObject.class);
        String result = object.getAsJsonArray("rates").toString();
        result = result.replace("[","").replace("]","");
        System.out.println(result);
        JsonObject object2 = new Gson().fromJson(result,JsonObject.class );
        String result2 = object2.get("bid").toString();

//        System.out.println("chuj dupa");
//        System.out.println(result2);
        return Double.parseDouble(result2);

    }
}

