import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';
import styles from './styles';

export default function Sobre() {
  return (
    <View style={styles.container}>
      <Text>Sobre!</Text>
      <StatusBar style="auto" />
    </View>
  );
}