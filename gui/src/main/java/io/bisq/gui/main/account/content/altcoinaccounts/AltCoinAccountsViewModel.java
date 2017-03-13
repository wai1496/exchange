/*
 * This file is part of bisq.
 *
 * bisq is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at
 * your option) any later version.
 *
 * bisq is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with bisq. If not, see <http://www.gnu.org/licenses/>.
 */

package io.bisq.gui.main.account.content.altcoinaccounts;

import com.google.inject.Inject;
import io.bisq.gui.common.model.ActivatableWithDataModel;
import io.bisq.gui.common.model.ViewModel;
import io.bisq.payment.PaymentAccount;
import javafx.collections.ObservableList;

class AltCoinAccountsViewModel extends ActivatableWithDataModel<AltCoinAccountsDataModel> implements ViewModel {

    @Inject
    public AltCoinAccountsViewModel(AltCoinAccountsDataModel dataModel) {
        super(dataModel);
    }

    @Override
    protected void activate() {
    }

    @Override
    protected void deactivate() {
    }


    ///////////////////////////////////////////////////////////////////////////////////////////
    // UI actions
    ///////////////////////////////////////////////////////////////////////////////////////////

    public void onSaveNewAccount(PaymentAccount paymentAccount) {
        dataModel.onSaveNewAccount(paymentAccount);
    }

    public boolean onDeleteAccount(PaymentAccount paymentAccount) {
        return dataModel.onDeleteAccount(paymentAccount);
    }

    public void onSelectAccount(PaymentAccount paymentAccount) {
        dataModel.onSelectAccount(paymentAccount);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    // Getters
    ///////////////////////////////////////////////////////////////////////////////////////////

    ObservableList<PaymentAccount> getPaymentAccounts() {
        return dataModel.paymentAccounts;
    }
}