//================================================================================
// This class is made by:
// - Sven Westerlaken
//================================================================================

package informatica.groep1.bioscoopapp.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

import informatica.groep1.bioscoopapp.PaymentActivity;
import informatica.groep1.bioscoopapp.R;
import informatica.groep1.bioscoopapp.adapter.SeatGridAdapter;
import informatica.groep1.bioscoopapp.businesslogic.SeatHandler;
import informatica.groep1.bioscoopapp.domain.Screening;
import informatica.groep1.bioscoopapp.domain.Seat;

public class SeatReservationActivity extends AppCompatActivity {
	
	//================================================================================
	// Mutators
	//================================================================================
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seat_reservation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final Screening screening = (Screening) getIntent().getSerializableExtra("Screening");
        int ticketCount = getIntent().getIntExtra("TicketCount", 1);
        final double price = getIntent().getDoubleExtra("Price", 8.00);

        TextView sRemaining = (TextView) findViewById(R.id.seatReservationActivity_TV_seatsremainingValue);
        Button orderBtn = (Button) findViewById(R.id.seatReservationActivity_BTN_order);

        GridView seatGrid = (GridView) findViewById(R.id.seatReservationActivity_GV_seatGrid);
        ArrayList<Seat> seats = new ArrayList<>();

        for(int i=0; i < 100; i++) {
            seats.add(new Seat(i + 1));
        }

        final SeatHandler seathandler = new SeatHandler(sRemaining, orderBtn, ticketCount);

        SeatGridAdapter sga = new SeatGridAdapter(getBaseContext(), seats, seathandler);
        seatGrid.setAdapter(sga);
        sga.notifyDataSetChanged();

        seathandler.setGrid(seatGrid);

        orderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
	            Bundle extras = getIntent().getExtras();
                Intent i = new Intent(getApplicationContext(), PaymentActivity.class);
                i.putExtra("ReservedSeats", seathandler.getSelectedSeats());
                i.putExtra("Screening", screening);
                i.putExtra("Price", price);
	            i.putExtra("ChildCount", extras.getInt("ChildCount"));
	            i.putExtra("AdultCount", extras.getInt("AdultCount"));
	            startActivity(i);
            }
        });
    }

}
