package Interfaces;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

public class iListaAlumnis  implements AdapterView.OnItemClickListener{
    Context ctx;

    public  iListaAlumnis (Context ctx) {
        this.ctx=ctx;
    }



    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        //Toast.makeText(ctx, "Has seleccionado a "
          //      +adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_LONG).show();
    }
}
