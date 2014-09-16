package yh.contactmanage.Activities;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import yh.contactmanage.Adapters.PicassoAdapter;
import yh.contactmanage.Models.ContactModel;
import yh.contactmanage.R;


public class MainActivity extends ListActivity {

    ArrayList<ContactModel> contactArrayList;
    PicassoAdapter picassoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactArrayList = new ArrayList<ContactModel>();
        contactArrayList.add(new ContactModel("http://standout.se/img/david.elbe.jpg", "David Elbe", "balblallalsldlasdlalsdkalsd"));
        contactArrayList.add(new ContactModel("http://standout.se/img/david.elbe.jpg", "David Elbe", "balblallalsldlasdlalsdkalsd"));
        contactArrayList.add(new ContactModel("http://standout.se/img/david.elbe.jpg", "David Elbe", "balblallalsldlasdlalsdkalsd"));
        contactArrayList.add(new ContactModel("http://standout.se/img/david.elbe.jpg", "David Elbe", "balblallalsldlasdlalsdkalsd"));
        contactArrayList.add(new ContactModel("http://standout.se/img/david.elbe.jpg", "David Elbe", "balblallalsldlasdlalsdkalsd"));

        picassoAdapter = new PicassoAdapter(this, contactArrayList);

        setListAdapter(picassoAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
