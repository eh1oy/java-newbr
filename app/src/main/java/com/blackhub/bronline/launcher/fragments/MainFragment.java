package com.blackhub.bronline.launcher.fragments;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.FragmentMainBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.preferences.Preferences;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.Useful;
import com.blackhub.bronline.game.gui.fractions.Const;
import com.blackhub.bronline.game.gui.menupausesettingandmap.NewMenuConstants;
import com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment;
import com.blackhub.bronline.game.gui.playerslist.utils.PlayersListUtilsKt;
import com.blackhub.bronline.launcher.LauncherConstants;
import com.blackhub.bronline.launcher.Settings;
import com.blackhub.bronline.launcher.activities.MainActivity;
import com.caverock.androidsvg.SVG;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.metrics.AddTrace;
import com.google.firebase.perf.metrics.Trace;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes4.dex
 */
/* compiled from: MainFragment.kt */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0002J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0016H\u0003J\b\u0010\u0017\u001a\u00020\tH\u0003J\b\u0010\u0018\u001a\u00020\u0012H\u0002J\b\u0010\u0019\u001a\u00020\u0012H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0002J\b\u0010\u001b\u001a\u00020\u0012H\u0016J\b\u0010\u001c\u001a\u00020\u0012H\u0003J\u0010\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0005H\u0003J\u0018\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0003J\u0010\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020#H\u0002J\b\u0010&\u001a\u00020\u0012H\u0003J\b\u0010'\u001a\u00020\u0012H\u0003R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006("}, d2 = {"Lcom/blackhub/bronline/launcher/fragments/MainFragment;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/FragmentMainBinding;", "()V", PlayersListUtilsKt.KEY_GET_PLAYER_NICK, "", "getNick", "()Ljava/lang/String;", "checkIfNickHasUnderscore", "", Const.FRACTION_CONTROL_PLAYER_NICKNAME, "checkIfNicknameHasOnlyOneUnderscore", "checkLengthOfNickname", "checkNicknameEditTextIsNotEmpty", "checkSurnameEditTextIsNotEmpty", "surname", "getViewBinding", "hideEditTextSurnameAndSetNicknameInOneEditText", "", "initViews", "isExternalStorageAvailable", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Landroid/app/Activity;", "isNicknameValid", "onClickSettings", "onDestroy", "onInfoButtonClickListener", "onResume", "onSocialMediaButtonClickListeners", "saveNicknameInPreferences", TypedValues.Custom.S_STRING, "setButtonsTouchListener", SVG.View.NODE_NAME, "Landroid/view/View;", "buttonKey", "", "setInfoTextView", "highlightedString", "setupEditTextName", "setupEditTextSurname", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMainFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainFragment.kt\ncom/blackhub/bronline/launcher/fragments/MainFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n+ 4 FragmentTransaction.kt\nandroidx/fragment/app/FragmentTransactionKt\n+ 5 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,410:1\n1#2:411\n28#3,6:412\n34#3,6:423\n80#4,5:418\n1174#5,2:429\n*S KotlinDebug\n*F\n+ 1 MainFragment.kt\ncom/blackhub/bronline/launcher/fragments/MainFragment\n*L\n108#1:412,6\n108#1:423,6\n110#1:418,5\n154#1:429,2\n*E\n"})
/* loaded from: classes4.dex */
public final class MainFragment extends BaseFragment<FragmentMainBinding> {
    public static final int $stable = 0;

    private final String getNick() {
        FragmentActivity activity = getActivity();
        if (activity != null && !isExternalStorageAvailable(activity)) {
            return AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
        }
        String string = Preferences.getString(getContext(), NewMenuConstants.PLAYERS_NICK);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        FragmentMainBinding binding = getBinding();
        AppCompatButton buttonPlay = binding.buttonPlay;
        Intrinsics.checkNotNullExpressionValue(buttonPlay, "buttonPlay");
        setOnClickListenerWithAnimAndDelay(buttonPlay, 200L, new Function0<Unit>() { // from class: com.blackhub.bronline.launcher.fragments.MainFragment$initViews$1$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                boolean isNicknameValid;
                FragmentMainBinding binding2;
                isNicknameValid = MainFragment.this.isNicknameValid();
                if (isNicknameValid) {
                    binding2 = MainFragment.this.getBinding();
                    binding2.progressBar.setVisibility(0);
                    MainFragment.this.startActivity(new Intent(MainFragment.this.getActivity(), (Class<?>) JNIActivity.class));
                    FragmentActivity activity = MainFragment.this.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                }
            }
        });
        AppCompatButton buttonSettings = binding.buttonSettings;
        Intrinsics.checkNotNullExpressionValue(buttonSettings, "buttonSettings");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonSettings, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.launcher.fragments.MainFragment$initViews$1$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                MainFragment.this.onClickSettings();
            }
        }, 1, null);
        if (getNick().length() == 0) {
            binding.editTextSurname.setVisibility(0);
            binding.editTextName.setHint(R.string.fragment_main_enter_name);
        } else {
            binding.editTextName.setText(getNick());
            binding.editTextSurname.setVisibility(8);
            binding.editTextName.setHint(R.string.fragment_main_enter_nik);
        }
        TextView textView = binding.tvBlackRussia;
        Useful useful = Useful.INSTANCE;
        String string = getString(R.string.common_black_russia_with_red_black);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        textView.setText(useful.getTextWithHtmlStyles(string));
        setupEditTextName();
        setupEditTextSurname();
        onSocialMediaButtonClickListeners();
        onInfoButtonClickListener();
        setInfoTextView(-1);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        MainActivity.Companion companion = MainActivity.INSTANCE;
        FragmentActivity activity = getActivity();
        Window window = activity != null ? activity.getWindow() : null;
        ConstraintLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        companion.hideSystemUI(window, root);
        UtilsKt.crashlyticsLog("MainFragment onResume");
    }

    public final void onClickSettings() {
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        FragmentTransaction beginTransaction = parentFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(beginTransaction, "beginTransaction()");
        beginTransaction.setReorderingAllowed(true);
        Intrinsics.checkNotNullExpressionValue(beginTransaction.replace(R.id.fragment_container_view, MenuSettingMainUiFragment.class, null, null), "replace(containerViewId, F::class.java, args, tag)");
        beginTransaction.addToBackStack(AnyExtensionKt.empty(StringCompanionObject.INSTANCE));
        beginTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        beginTransaction.commit();
    }

    @AddTrace(name = "MainFragment isNicknameValid()")
    public final boolean isNicknameValid() {
        Trace startTrace = FirebasePerformance.startTrace("MainFragment isNicknameValid()");
        String valueOf = String.valueOf(getBinding().editTextName.getText());
        String valueOf2 = String.valueOf(getBinding().editTextSurname.getText());
        if (getNick().length() == 0) {
            if (!checkNicknameEditTextIsNotEmpty(valueOf) || !checkSurnameEditTextIsNotEmpty(valueOf2)) {
                startTrace.stop();
                return false;
            }
            saveNicknameInPreferences(valueOf + LauncherConstants.UNDERSCORE_STRING + valueOf2);
        } else {
            if (!checkNicknameEditTextIsNotEmpty(valueOf)) {
                startTrace.stop();
                return false;
            }
            if (!checkLengthOfNickname(valueOf)) {
                startTrace.stop();
                return false;
            }
            if (!checkIfNickHasUnderscore(valueOf)) {
                startTrace.stop();
                return false;
            }
            saveNicknameInPreferences(String.valueOf(getBinding().editTextName.getText()));
        }
        startTrace.stop();
        return true;
    }

    public final boolean checkIfNickHasUnderscore(String nickname) {
        if ((!StringsKt__StringsKt.startsWith$default((CharSequence) nickname, LauncherConstants.UNDERSCORE_CHAR, false, 2, (Object) null)) && (checkIfNicknameHasOnlyOneUnderscore(nickname) & (StringsKt__StringsKt.endsWith$default(nickname, LauncherConstants.UNDERSCORE_CHAR, false, 2, null) ^ true))) {
            return true;
        }
        setInfoTextView(0);
        getBinding().editTextName.setBackground(AppCompatResources.getDrawable(requireContext(), R.drawable.bg_rectangle_red15_cr4_t1_red));
        getBinding().textViewInfoAboutNickname.setVisibility(0);
        return false;
    }

    @AddTrace(name = "MainFragment setupEditTextName()")
    public final void setupEditTextName() {
        Trace startTrace = FirebasePerformance.startTrace("MainFragment setupEditTextName()");
        getBinding().editTextName.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.blackhub.bronline.launcher.fragments.MainFragment$$ExternalSyntheticLambda2
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                boolean z;
                z = MainFragment.setupEditTextName$lambda$4(MainFragment.this, textView, i, keyEvent);
                return z;
            }
        });
        getBinding().editTextName.setOnKeyboardClosed(new Function0<Unit>() { // from class: com.blackhub.bronline.launcher.fragments.MainFragment$setupEditTextName$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                FragmentMainBinding binding;
                FragmentMainBinding binding2;
                FragmentMainBinding binding3;
                MainActivity.Companion companion = MainActivity.INSTANCE;
                FragmentActivity activity = MainFragment.this.getActivity();
                Window window = activity != null ? activity.getWindow() : null;
                binding = MainFragment.this.getBinding();
                ConstraintLayout root = binding.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                companion.hideSystemUI(window, root);
                binding2 = MainFragment.this.getBinding();
                if (binding2.editTextSurname.getVisibility() == 0) {
                    MainFragment.this.hideEditTextSurnameAndSetNicknameInOneEditText();
                    return;
                }
                MainFragment mainFragment = MainFragment.this;
                binding3 = mainFragment.getBinding();
                mainFragment.saveNicknameInPreferences(String.valueOf(binding3.editTextName.getText()));
            }
        });
        startTrace.stop();
    }

    public static final boolean setupEditTextName$lambda$4(MainFragment this$0, TextView v, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(v, "v");
        if (i != 6) {
            return false;
        }
        Context context = this$0.getContext();
        Object systemService = context != null ? context.getSystemService("input_method") : null;
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(this$0.getBinding().getRoot().getWindowToken(), 0);
        v.setFocusable(false);
        v.setFocusableInTouchMode(true);
        MainActivity.Companion companion = MainActivity.INSTANCE;
        FragmentActivity activity = this$0.getActivity();
        Window window = activity != null ? activity.getWindow() : null;
        ConstraintLayout root = this$0.getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        companion.hideSystemUI(window, root);
        if (this$0.getBinding().editTextSurname.getVisibility() == 0) {
            this$0.hideEditTextSurnameAndSetNicknameInOneEditText();
        } else {
            this$0.saveNicknameInPreferences(String.valueOf(this$0.getBinding().editTextName.getText()));
        }
        return true;
    }

    @AddTrace(name = "MainFragment setupEditTextSurname()")
    public final void setupEditTextSurname() {
        Trace startTrace = FirebasePerformance.startTrace("MainFragment setupEditTextSurname()");
        getBinding().editTextSurname.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.blackhub.bronline.launcher.fragments.MainFragment$$ExternalSyntheticLambda1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                boolean z;
                z = MainFragment.setupEditTextSurname$lambda$5(MainFragment.this, textView, i, keyEvent);
                return z;
            }
        });
        getBinding().editTextSurname.setOnKeyboardClosed(new Function0<Unit>() { // from class: com.blackhub.bronline.launcher.fragments.MainFragment$setupEditTextSurname$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                FragmentMainBinding binding;
                FragmentMainBinding binding2;
                MainActivity.Companion companion = MainActivity.INSTANCE;
                FragmentActivity activity = MainFragment.this.getActivity();
                Window window = activity != null ? activity.getWindow() : null;
                binding = MainFragment.this.getBinding();
                ConstraintLayout root = binding.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                companion.hideSystemUI(window, root);
                binding2 = MainFragment.this.getBinding();
                if (binding2.editTextSurname.getVisibility() == 0) {
                    MainFragment.this.hideEditTextSurnameAndSetNicknameInOneEditText();
                }
            }
        });
        startTrace.stop();
    }

    public static final boolean setupEditTextSurname$lambda$5(MainFragment this$0, TextView v, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(v, "v");
        if (i != 6) {
            return false;
        }
        Context context = this$0.getContext();
        Object systemService = context != null ? context.getSystemService("input_method") : null;
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(this$0.getBinding().getRoot().getWindowToken(), 0);
        v.setFocusable(false);
        v.setFocusableInTouchMode(true);
        MainActivity.Companion companion = MainActivity.INSTANCE;
        FragmentActivity activity = this$0.getActivity();
        Window window = activity != null ? activity.getWindow() : null;
        ConstraintLayout root = this$0.getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        companion.hideSystemUI(window, root);
        if (this$0.getBinding().editTextSurname.getVisibility() == 0) {
            this$0.hideEditTextSurnameAndSetNicknameInOneEditText();
        }
        return true;
    }

    public final void hideEditTextSurnameAndSetNicknameInOneEditText() {
        String str;
        if (String.valueOf(getBinding().editTextSurname.getText()).length() <= 0 || String.valueOf(getBinding().editTextName.getText()).length() <= 0) {
            return;
        }
        String valueOf = String.valueOf(getBinding().editTextName.getText());
        String valueOf2 = String.valueOf(getBinding().editTextSurname.getText());
        if (StringsKt__StringsKt.endsWith$default((CharSequence) valueOf, LauncherConstants.UNDERSCORE_CHAR, false, 2, (Object) null)) {
            str = valueOf + valueOf2;
        } else {
            str = valueOf + LauncherConstants.UNDERSCORE_STRING + valueOf2;
        }
        getBinding().editTextSurname.setVisibility(8);
        getBinding().editTextName.setText(str);
        getBinding().editTextName.setBackground(AppCompatResources.getDrawable(requireContext(), R.drawable.bg_rectangle_black50_cr4_t2_white));
        saveNicknameInPreferences(str);
    }

    public final void onInfoButtonClickListener() {
        ImageButton ibInfo = getBinding().ibInfo;
        Intrinsics.checkNotNullExpressionValue(ibInfo, "ibInfo");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, ibInfo, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.launcher.fragments.MainFragment$onInfoButtonClickListener$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                FragmentMainBinding binding;
                FragmentMainBinding binding2;
                FragmentMainBinding binding3;
                binding = MainFragment.this.getBinding();
                if (binding.textViewInfoAboutNickname.getVisibility() == 0) {
                    binding3 = MainFragment.this.getBinding();
                    binding3.textViewInfoAboutNickname.setVisibility(4);
                } else {
                    binding2 = MainFragment.this.getBinding();
                    binding2.textViewInfoAboutNickname.setVisibility(0);
                }
            }
        }, 1, null);
    }

    public final void setInfoTextView(int highlightedString) {
        String[] stringArray = getResources().getStringArray(R.array.launcher_info_array);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = stringArray.length;
        for (int i = 0; i < length; i++) {
            if (i == highlightedString) {
                int color = ContextCompat.getColor(requireContext(), 2131100503);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(stringArray[i]);
                spannableStringBuilder2.setSpan(new ForegroundColorSpan(color), 0, stringArray[i].length(), 33);
                spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
            } else {
                spannableStringBuilder.append((CharSequence) stringArray[i]);
            }
        }
        getBinding().textViewInfoAboutNickname.setText(spannableStringBuilder);
    }

    public final boolean checkNicknameEditTextIsNotEmpty(String nickname) {
        if (nickname.length() == 0) {
            setInfoTextView(0);
            getBinding().textViewInfoAboutNickname.setVisibility(0);
            getBinding().editTextName.setBackground(AppCompatResources.getDrawable(requireContext(), R.drawable.bg_rectangle_red15_cr4_t1_red));
            return false;
        }
        getBinding().editTextName.setBackground(AppCompatResources.getDrawable(requireContext(), R.drawable.bg_rectangle_black50_cr4_t2_white));
        return true;
    }

    public final boolean checkSurnameEditTextIsNotEmpty(String surname) {
        if (getBinding().editTextSurname.getVisibility() != 0) {
            return true;
        }
        if (surname.length() == 0) {
            setInfoTextView(0);
            getBinding().editTextSurname.setBackground(AppCompatResources.getDrawable(requireContext(), R.drawable.bg_rectangle_red15_cr4_t1_red));
            getBinding().textViewInfoAboutNickname.setVisibility(0);
            return false;
        }
        getBinding().editTextSurname.setBackground(AppCompatResources.getDrawable(requireContext(), R.drawable.bg_rectangle_black50_cr4_t2_white));
        return true;
    }

    public final boolean checkLengthOfNickname(String nickname) {
        if (nickname.length() < 3 || nickname.length() > 23) {
            setInfoTextView(1);
            getBinding().textViewInfoAboutNickname.setVisibility(0);
            getBinding().editTextName.setBackground(AppCompatResources.getDrawable(requireContext(), R.drawable.bg_rectangle_red15_cr4_t1_red));
            return false;
        }
        getBinding().editTextName.setBackground(AppCompatResources.getDrawable(requireContext(), R.drawable.bg_rectangle_black50_cr4_t2_white));
        return true;
    }

    @AddTrace(name = "MainFragment saveNicknameInPreferences()")
    public final void saveNicknameInPreferences(String string) {
        Trace startTrace = FirebasePerformance.startTrace("MainFragment saveNicknameInPreferences()");
        FragmentActivity activity = getActivity();
        Boolean valueOf = activity != null ? Boolean.valueOf(isExternalStorageAvailable(activity)) : null;
        Intrinsics.checkNotNull(valueOf);
        if (!valueOf.booleanValue()) {
            startTrace.stop();
        } else {
            Preferences.putString(getContext(), NewMenuConstants.PLAYERS_NICK, string);
            startTrace.stop();
        }
    }

    @AddTrace(name = "MainFragment setButtonsTouchListener()")
    @SuppressLint({"ClickableViewAccessibility"})
    public final void setButtonsTouchListener(View view, final int buttonKey) {
        Trace startTrace = FirebasePerformance.startTrace("MainFragment setButtonsTouchListener()");
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = -100.0f;
        final Ref.FloatRef floatRef2 = new Ref.FloatRef();
        floatRef2.element = -100.0f;
        view.setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.launcher.fragments.MainFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean buttonsTouchListener$lambda$7;
                buttonsTouchListener$lambda$7 = MainFragment.setButtonsTouchListener$lambda$7(Ref.FloatRef.this, floatRef2, this, buttonKey, view2, motionEvent);
                return buttonsTouchListener$lambda$7;
            }
        });
        startTrace.stop();
    }

    public static final boolean setButtonsTouchListener$lambda$7(Ref.FloatRef touchListenerX, Ref.FloatRef touchListenerY, final MainFragment this$0, final int i, View v, MotionEvent event) {
        Intrinsics.checkNotNullParameter(touchListenerX, "$touchListenerX");
        Intrinsics.checkNotNullParameter(touchListenerY, "$touchListenerY");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 0) {
            touchListenerX.element = event.getX();
            touchListenerY.element = event.getY();
            v.setBackground(ContextCompat.getDrawable(this$0.requireContext(), R.drawable.bg_rectangle_gray_hgr_cr6_with_red_gradient));
        }
        if (event.getAction() == 1) {
            v.setBackground(ContextCompat.getDrawable(this$0.requireContext(), R.drawable.bg_rectangle_gray_hgr_cr6_with_gray_gradient_1));
            if (Math.abs(touchListenerX.element - event.getX()) <= 100.0f && Math.abs(touchListenerY.element - event.getY()) <= 100.0f) {
                BaseFragment.startAnimAndDelay$default(this$0, v, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.launcher.fragments.MainFragment$setButtonsTouchListener$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        int i2 = i;
                        if (i2 == 156) {
                            this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(Settings.URL_TELEGRAM)));
                        } else if (i2 == 176) {
                            this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(Settings.URL_DISCORD)));
                        } else {
                            if (i2 != 306) {
                                return;
                            }
                            this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(Settings.URL_VK)));
                        }
                    }
                }, 1, null);
            }
        }
        return false;
    }

    @AddTrace(name = "MainFragment onSocialMediaButtonClickListeners()")
    public final void onSocialMediaButtonClickListeners() {
        Trace startTrace = FirebasePerformance.startTrace("MainFragment onSocialMediaButtonClickListeners()");
        ImageButton buttonDiscord = getBinding().buttonDiscord;
        Intrinsics.checkNotNullExpressionValue(buttonDiscord, "buttonDiscord");
        setButtonsTouchListener(buttonDiscord, 176);
        ImageButton buttonVk = getBinding().buttonVk;
        Intrinsics.checkNotNullExpressionValue(buttonVk, "buttonVk");
        setButtonsTouchListener(buttonVk, 306);
        ImageButton buttonTelegram = getBinding().buttonTelegram;
        Intrinsics.checkNotNullExpressionValue(buttonTelegram, "buttonTelegram");
        setButtonsTouchListener(buttonTelegram, 156);
        startTrace.stop();
    }

    @AddTrace(name = "MainFragment isExternalStorageAvailable()")
    private final boolean isExternalStorageAvailable(Activity activity) {
        Trace startTrace = FirebasePerformance.startTrace("MainFragment isExternalStorageAvailable()");
        try {
            File externalFilesDir = activity.getExternalFilesDir(null);
            Intrinsics.checkNotNull(externalFilesDir);
            externalFilesDir.getAbsolutePath();
            startTrace.stop();
            return true;
        } catch (Exception e) {
            UtilsKt.crashlyticsRecordNewException("MainFragment isExternalStorageAvailable() exception: " + e);
            Toast.makeText(activity, activity.getResources().getString(R.string.fragment_main_no_external_storage), 1).show();
            startTrace.stop();
            return false;
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public FragmentMainBinding getViewBinding() {
        FragmentMainBinding inflate = FragmentMainBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        UtilsKt.crashlyticsLog("MainFragment onDestroy");
    }

    public final boolean checkIfNicknameHasOnlyOneUnderscore(String nickname) {
        int i = 0;
        for (int i2 = 0; i2 < nickname.length(); i2++) {
            if (nickname.charAt(i2) == '_' && (i = i + 1) > 1) {
                return false;
            }
        }
        return i == 1;
    }
}
