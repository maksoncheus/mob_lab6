**Макаров Максим 803в2.**  
Обратимся к первой лабораторной, в которой я сделал счетчик нажатий на кнопку.  
Немного отредактируем код для сохранения параметров счетчика:  
```Java
	public class MainActivity extends AppCompatActivity {
    int cntr = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onSaveInstanceState(Bundle outState)
    {
        outState.putInt("counter", cntr);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState)
    {
        super.onRestoreInstanceState(savedInstanceState);
        cntr = savedInstanceState.getInt("counter");
    }


    public void btn_click(View view)
    {
        TextView txt = (TextView)findViewById(R.id.textView);
        txt.setText("Вы нажали на кнопку " + ++cntr + " раз");
    }
}
```  
Теперь при смене на ландшафтный режим и обратно, счетчик не будет сбрасываться:  
[![Alternate Text]({/rsc/mob_lab6_2.jpg})]({/rsc/test.mp4} "Link Title")