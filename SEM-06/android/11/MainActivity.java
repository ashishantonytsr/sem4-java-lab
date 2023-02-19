public class MainActivity extends AppCompatActivity {
    String[] spinnerItems = { "ANDROID", "PHP" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        EditText editText = (EditText) findViewById(R.id.editText);
        Button btn = (Button) findViewById(R.id.btn);

        List stringList = new ArrayList(Arrays.asList(spinnerItems));
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, R.layout.spinner_item, stringList);
        adapter.setDropDownViewResource(R.layout.spinner_item);
        spinner.setAdapter(adapter);
        
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getText = editText.getText().toString();
                stringList.add(getText);
                adapter.notifyDataSetChanged();
                Toast.makeText(MainActivity.this, "Item Added", Toast.LENGTH_SHORT).show();
            }
        });
    }
}