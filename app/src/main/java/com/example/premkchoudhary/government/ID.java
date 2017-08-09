package com.example.premkchoudhary.government;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class ID extends AppCompatActivity {

    TextView tvHyperOnline , txtHyperNSDL , txtHyperUTITSL , txtDocumentSeeMore ,txtApplyForPAN ,txtChangePANData
            ,txtNSDLStatusPAN,txtUTITSLStatusPAN , txtOnlinePANVerifySeeMore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_id);

        tvHyperOnline = (TextView) findViewById(R.id.txtHyperOnline);
        txtHyperNSDL = (TextView) findViewById(R.id.txtHyperNSDL);
        txtHyperUTITSL = (TextView) findViewById(R.id.txtHyperUTITSL);
        txtDocumentSeeMore = (TextView) findViewById(R.id.txtDocumentSeeMore);
        txtApplyForPAN =(TextView) findViewById(R.id.txtApplyForPAN);
        txtChangePANData= (TextView) findViewById(R.id.txtChangePANData);
        txtNSDLStatusPAN= (TextView) findViewById(R.id.txtNSDLStatusPAN);
        txtUTITSLStatusPAN= (TextView) findViewById(R.id.txtUTITSLStatusPAN);
        txtOnlinePANVerifySeeMore= (TextView) findViewById(R.id.txtPANVerificationDescSeeMore);

        tvHyperOnline.setClickable(true);
        tvHyperOnline.setMovementMethod(LinkMovementMethod.getInstance());
        String textOnline = "<a href='https://www.incometaxindia.gov.in/Pages/tax-services/apply-for-pan.aspx'>Click to apply online</a>";
        tvHyperOnline.setText(Html.fromHtml(textOnline));

        txtHyperNSDL.setClickable(true);
        txtHyperNSDL.setMovementMethod(LinkMovementMethod.getInstance());
        String textNSDL = "<a href='https://www.tin-nsdl.com/services/pan/pan-index.html'>(a)NSDL </a>";
        txtHyperNSDL.setText(Html.fromHtml(textNSDL));

        txtHyperUTITSL.setClickable(true);
        txtHyperUTITSL.setMovementMethod(LinkMovementMethod.getInstance());
        String textUTITSL = "<a href='https://www.utiitsl.com/UTIITSL_SITE/pan/index.html'>(b) UTITSL</a>";
        txtHyperUTITSL.setText(Html.fromHtml(textUTITSL));

         txtApplyForPAN.setClickable(true);
        txtApplyForPAN.setMovementMethod(LinkMovementMethod.getInstance());
        String txtPAN = "<a href='https://www.incometaxindia.gov.in/Pages/form-pan.aspx'>Apply For PAN</a>";
        txtApplyForPAN.setText(Html.fromHtml(txtPAN));

        txtChangePANData.setClickable(true);
        txtChangePANData.setMovementMethod(LinkMovementMethod.getInstance());
        String txtChangeData = "<a href='https://www.incometaxindia.gov.in/Documents/form-for-changes-in-pan.pdf'>Change Your PAN Data</a>";
        txtChangePANData.setText(Html.fromHtml(txtChangeData));

        txtDocumentSeeMore.setClickable(true);
        txtDocumentSeeMore.setMovementMethod(LinkMovementMethod.getInstance());
        String txtDocMore = "<a href='https://www.incometaxindia.gov.in/Documents/documents-required-for-pan.pdf'>See more</a>";
        txtDocumentSeeMore.setText(Html.fromHtml(txtDocMore));

        txtNSDLStatusPAN.setClickable(true);
        txtNSDLStatusPAN.setMovementMethod(LinkMovementMethod.getInstance());
        String txtNSDLSP = "<a href='https://www.incometaxindia.gov.in/Pages/tax-services/status-of-pan-nsdl.aspx'> NSDL </a>";
        txtNSDLStatusPAN.setText(Html.fromHtml(txtNSDLSP));

        txtUTITSLStatusPAN.setClickable(true);
        txtUTITSLStatusPAN.setMovementMethod(LinkMovementMethod.getInstance());
        String txtUTITSLSP = "<a href='https://www.incometaxindia.gov.in/Pages/tax-services/status-of-pan-utitsl.aspx'> UTITSL </a>";
        txtUTITSLStatusPAN.setText(Html.fromHtml(txtUTITSLSP));

        txtOnlinePANVerifySeeMore.setClickable(true);
        txtOnlinePANVerifySeeMore.setMovementMethod(LinkMovementMethod.getInstance());
        String txtPANVerifySeeMore = "<a href='https://www.incometaxindia.gov.in/Pages/tax-services/online-pan-verification.aspx'> See more </a>";
        txtOnlinePANVerifySeeMore.setText(Html.fromHtml(txtPANVerifySeeMore));
    }

}
