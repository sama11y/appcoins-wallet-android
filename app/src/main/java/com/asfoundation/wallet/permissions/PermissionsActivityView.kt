package com.asfoundation.wallet.permissions

import com.appcoins.wallet.permissions.PermissionName

interface PermissionsActivityView {
  fun showPermissionFragment(callingPackage: String,
                             permission: PermissionName)

}
