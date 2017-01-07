# MottoPush
1.极光推送的使用，以及DialogActivty的运用。
   利用极光推送，推送富文本图片，在DialogActivity上进行显示。  
   
   
   private ImageView mMottoImg;
    private Intent mIntent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        mMottoImg = (ImageView) findViewById(R.id.mottoImg);

        mIntent = getIntent();
        String path = mIntent.getStringExtra(MyPushReceiver.PUSH_IMAGE_PATH_KEY);
        if (path != null) {
            File file = new File(path);
            Picasso.with(this).load(file).into(mMottoImg);
        }


        mMottoImg.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                finish();
                return true;
            }
        });
    }
