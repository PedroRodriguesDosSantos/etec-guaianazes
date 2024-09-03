import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View, Button } from 'react-native';
import styles from './styles';
import { useNavigation } from '@react-navigation/native';

export default function Home() {
    const navigation = useNavigation();
  return (
    <View style={styles.container}>
      <Text>Home!</Text>
      <Button title="Sobre" onPress={ () => navigation.navigate('Sobre') }/>
      <StatusBar style="auto" />
    </View>
  );
}