package kr.co.asianaidt.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nickname.*

class EditNicknameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)

        btnOk.setOnClickListener {

            //1. 입력한 닉네임을 변수에 저장
            val inputNickname = edtNickname.text.toString()

            //2. 변수에 담은 닉네임을 돌아가는 길에 첨부 (intent활용)
            val resultIntent = Intent() //단순 첨부용 => 출발/목적지 표시 x

            resultIntent.putExtra("nickname", inputNickname)

            //3. ok를 누른게 맞다고 추가 표시
            setResult(RESULT_OK, resultIntent)

            //4. 현재 화면을 종료 (복귀)
            finish()
        }
    }
}