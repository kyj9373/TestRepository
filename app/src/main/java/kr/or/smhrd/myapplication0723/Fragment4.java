package kr.or.smhrd.myapplication0723;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class Fragment4 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        //View 타입 생성
        View view=inflater.inflate(R.layout.fragment_4, container, false);

        //view 객체를 통해서 fragment_1.xml에 배치된 View 객체들의 정보를 접근 할 수 있다.
        TextView fg4_tv_data=view.findViewById(R.id.fg4_tv_data); //fragment는 activity가 아니어서 view로 접근

        fg4_tv_data.setText("네번 째 프래그먼트 화면");

        return view;
    }
}