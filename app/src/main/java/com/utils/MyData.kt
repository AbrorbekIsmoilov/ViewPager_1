package com.utils

import com.example.viewpager_1.R

object MyData {
    val list = ArrayList<Data>()
    val lists = ArrayList<Data>()

    fun loddata() {
        list.add(
            Data(
                "Geoaxborot",
                "Geoaxborot moduli orqali siz o'zingizga yaqin bo'lgan migrantlar va boshqa muassasalar haqida ma'lumot olishingiz mumkin",
                R.drawable.geoaxborot
            )
        )
        list.add(
            Data(
                "Huquqiy axborot",
                "Huquqiy axborot moduli orqali siz migratsiya sohasiga oid yangiliklardan, qonunlardan xabardor bo'lishingiz va online konsultatsiya olishingiz mumkin",
                R.drawable.questionsami
            )
        )
        list.add(
            Data(
                " To'lovlar xizmatlari",
                "To'lov xizmatlari moduli orqali siz masofadan turib turli xil xizmatlarga to'lovlar haqida ma'lumot olishingiz va to'lovlarni amalga oshirishingiz mumkin",
                R.drawable.tolovlarxizmati
            )
        )
        list.add(
            Data(
                "Qo'shimcha imkoniyat",
                "Qo'shimcha imkoniyatlar moduli orqali siz interaktiv so'zlashgichlar va lug'atlar yordamida til bilish savodxonligingizni oshirishingiz mumkin",
                R.drawable.qoshimchaimkoniyat
            )
        )
    }

    fun axborotlod() {
        lists.add(
            Data(
                "Xush kelibsiz",
                "Kim ko‘rubdur, ey ko‘ngul, ahli jahondin yaxshilig‘, Kimki, ondin yaxshi yo‘q, ko‘z tutma ondin yaxshilig‘",
                R.drawable.rectangle
            )
        )
        lists.add(
            Data(
                "Hikoyalar dunyosi",
                "Gar zamonni nayf qilsam ayb qilma, ey rafiq, Ko‘rmadim hargiz, netoyin, bu zamondin yaxshilig‘!",
                R.drawable.rectangle2
            )
        )
        lists.add(
            Data(
                "Kitob ortidan..",
                "Dilrabolardin yomonliq keldi mahzun ko‘ngluma,Kelmadi jonimg'a hech oromi jondin yaxshilig'.",
                R.drawable.rectangle3
            )
        )
        lists.add(
            Data(
                "Bizga qo`shiling",
                "Ey ko‘ngul, chun yaxshidin ko‘rdung yamonliq asru ko‘p, Emdi ko‘z tutmoq ne ma’ni har yamondin yaxshilig'?",
                R.drawable.rectangle4
            )
        )
    }
}