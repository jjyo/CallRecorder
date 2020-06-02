package net.synapticweb.callrecorder.di;

import android.content.Context;

import net.synapticweb.callrecorder.data.Repository;
import net.synapticweb.callrecorder.data.RepositoryImpl;

import dagger.Module;
import dagger.Provides;

@Module
class RepositoryModule {
    private static final String DATABASE_NAME = "callrecorder.db";

    @Provides
     Repository provideRepository(Context context) {
        return new RepositoryImpl(context, DATABASE_NAME);
    }
}
