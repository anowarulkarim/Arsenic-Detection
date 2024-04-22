package com.example.arenic_detection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class suggestion extends AppCompatActivity {
    TextView suggestions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestion);
        suggestions=findViewById(R.id.suggest);
        Intent i=getIntent();
        if(i != null && i.hasExtra("flag_value")) {
            int flag = i.getIntExtra("flag_value", 0); // 0 is the default value if "flag" is not found
            // Use the 'flag' value as needed in this activity
            if(flag==0){
                String s= "আর্সেনিক বিষজনিত প্রতিকার সম্পর্কে পরামর্শ নিতে বিশেষজ্ঞ চিকিৎসকের সাথে যোগাযোগ করা উচিত। যে কোন ধরণের চিকিৎসা বা পরামর্শ বিধান সামগ্রী হওয়া উচিত। প্রধান পরামর্শের মধ্যে আছে:\n" +
                        "\n" +
                        "1. আর্সেনিকের অনুভূতি করলে তা নিশ্চিত করতে একজন চিকিৎসকের সাথে যোগাযোগ করুন। চিকিৎসক আপনার অবস্থাটি নিরীক্ষণ করে আপনাকে প্রয়োজনীয় চিকিৎসা প্রদান করবেন।\n" +
                        "\n" +
                        "2. নির্ভরযোগ্য জল ব্যবহার করা গুরুত্বপূর্ণ। নির্ভরযোগ্য জল না পাওয়া গেলে, যদি সম্ভব হয় তাতে সাফটি প্রয়োগ করা উচিত।\n" +
                        "\n" +
                        "3. সঠিক পুষ্টিকর খাবার গুরুত্বপূর্ণ। আর্সেনিক বিষজনিত সমস্যা সম্পর্কে পুষ্টিবিদের সাথে আলাপ করুন।\n" +
                        "\n" +
                        "4. সবুজ ও পরিষ্কার বাসা বজায় রাখা গুরুত্বপূর্ণ। বাসা ও সার্মিক পরিবেশে ধারণ করা উচিত।\n" +
                        "\n" +
                        "5. নিয়মিত চিকিৎসা পরীক্ষা ও পরামর্শ সম্পর্কে আপনার চিকিৎসকের সাথে যোগাযোগ রাখা উচিত।\n" +
                        "\n" +
                        "সাথে সাথে চিকিৎসকের সাথে যোগাযোগ করার পরামর্শের মূল লক্ষণ অনুসরণ করা উচিত এবং তারা আপনাকে কোনও আবশ্যক পরামর্শ বা চিকিৎসা দেবেন।";
                suggestions.setText(s);
            }
            if(flag==1){
                String ss="আপনার আরসেনিক শনাক্ত হয়নি.  যদি আপনি  পরীক্ষার ফলাফলে সন্তুষ্ট  না থাকেন।\n" +
                        "  তবে পুনরায়  শনাক্তকরন  পরিখাটি করুন। \n" +
                        "অথবা  নিরধারিত  আপনার  নিকতস্থ  সাস্থ  অধিধপ্তরের সাথে যোগাযোগ করে টিউবওয়েলের পানি পরীক্ষা  করুন।";
                suggestions.setText(ss);
            }
        }
        else{
            suggestions.setText("not found");
        }

    }
}