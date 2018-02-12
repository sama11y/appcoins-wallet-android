package com.wallet.crypto.trustapp.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;
import com.wallet.crypto.trustapp.interact.ChangeTokenEnableInteract;
import com.wallet.crypto.trustapp.interact.DeleteTokenInteract;
import com.wallet.crypto.trustapp.interact.FetchAllTokenInfoInteract;

public class TokenChangeCollectionViewModelFactory implements ViewModelProvider.Factory {

  private final FetchAllTokenInfoInteract fetchAllTokenInfoInteract;
  private final DeleteTokenInteract deleteTokenInteract;
  private final ChangeTokenEnableInteract changeTokenEnableInteract;

  public TokenChangeCollectionViewModelFactory(FetchAllTokenInfoInteract fetchAllTokenInfoInteract,
      ChangeTokenEnableInteract changeTokenEnableInteract,
      DeleteTokenInteract deleteTokenInteract) {
    this.fetchAllTokenInfoInteract = fetchAllTokenInfoInteract;
    this.deleteTokenInteract = deleteTokenInteract;
    this.changeTokenEnableInteract = changeTokenEnableInteract;
  }

  @NonNull @Override public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
    return (T) new TokenChangeCollectionViewModel(fetchAllTokenInfoInteract,
        changeTokenEnableInteract, deleteTokenInteract);
  }
}
